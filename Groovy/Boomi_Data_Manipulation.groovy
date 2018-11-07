import java.util.Properties;
import java.io.InputStream;
import java.io.BufferedReader;
import com.boomi.execution.ExecutionUtil;

logger = ExecutionUtil.getBaseLogger();
//logger.info(" text ");
String LINE_SEPARATOR = System.getProperty("line.separator");

for( int i = 0; i < dataContext.getDataCount(); i++ ) {

   InputStream is = dataContext.getStream(i);
   Properties props = dataContext.getProperties(i);

   BufferedReader reader = new BufferedReader(new InputStreamReader(is));
   StringBuffer outData = new StringBuffer();
   int lineNum = 0;

   while ((line = reader.readLine()) != null) {
      String [] rows  = getRows(line);
      int numberOfRows = 0;
      numberOfRows = rows.size(); 
      logger.info("Number of rows: "+ numberOfRows);
      
      
      for (i=0;i<=(numberOfRows-3);i++){//Don't change the 3 and 1 values, last three "rows" and first "row" are data garbage and the number 
        def currentRow = rows[i];
        logger.info(" TEST, getting values from column, column 1 ");
        def currentData = getData(currentRow);
          for(j=0;j<(currentData.size());j++){ //Data inside the row (Columns) dont change the value 1, last element of row is datagarbage
              // --------- Logic here
              logger.info("Data: " + currentData.get(j));
              // --------- End Logic
          }
      }
    
    
      
    // Add line to output buffer including a line break at the end
    outData.append(line);
    outData.append(LINE_SEPARATOR);
    lineNum++;

   }

   // Convert the output StringBuffer to an InputStream and store in the dataContext
   is = new ByteArrayInputStream(outData.toString().getBytes("UTF-8"));
   dataContext.storeStream(is, props);
}

def getRows(bulkData){
    String [] rows;
    rows = bulkData.split("#");
    String [] rowOneArray;
    rowOneArray = rows[0].split("@"); //Don't change this
    rows[0] = rowOneArray[3]; //Don't change this
    return rows;
}

def getData(rowOfData){
    String row = rowOfData;
    String [] column = row.split("\\|",-1); //Don't change this
    List cleanedColumn = new ArrayList();
      int numberOfValidData = 0;
      for(int j = 1; j<(column.size()-1);j++){ //Don't change this
          if(column[j]!="^"){
              cleanedColumn.add(column[j]);
              numberOfValidData++;
          }
      }
      return cleanedColumn;
}