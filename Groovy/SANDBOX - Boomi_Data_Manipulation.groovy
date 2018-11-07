//IDE USED: https://www.tutorialspoint.com/execute_groovy_online.php
//import java.util.ArrayList
class Example {
   static void main(String[] args) {
      String a = "DBSTART|a6b5e62f-bb11-4fcc-bf26-493ee966b793|2|@|BEGIN|2|@|OUT_START|3|@|1|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|-|^||#|2|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|-|^||#|3|^||^||^||^||^|561|^|Receipt to unrestricted stock|^|Plant|^|4900068091|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|4|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|5|^||^||^||^||^|561|^|Receipt to unrestricted stock|^|Plant|^|4900068091|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|6|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|1|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|-|^||#|2|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|-|^||#|3|^||^||^||^||^|561|^|Receipt to unrestricted stock|^|Plant|^|4900068091|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|4|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|5|^||^||^||^||^|561|^|Receipt to unrestricted stock|^|Plant|^|4900068091|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|6|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|1|^||^||^||^||^|311|^|SLOC move at plant|^|Plant|^|4900060264|^|000000000000140050|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|NRRT|^|KRB6|^|SER03|^|-|^||#|2|^||^||^||^||^|311|^|SLOC move at plant|^|Plant|^|4900064005|^|000000000000140050|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|FULL|^|KRB6|^|SER03|^|-|^|PLTKRB6|#|3|^||^||^||^||^|311|^|SLOC move at plant|^|Plant|^|4900067175|^|000000000000140050|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|NRRT|^|KRB6|^|SER03|^|-|^||#||#|OUT_END|3|@|END|2|@|DBEND|a6b5e62f-bb11-4fcc-bf26-493ee966b793|2|@|";
      
      String[] str;
      str = a.split("#");
      //Data preparation
      String[] row1Array;
      row1Array = str[0].split("@");
      str[0] =  row1Array[3];
      int numberOfRows = str.size();
      println("Total columns= "+ (str.size()-2));
      //END Data preparation
      for (int i =0; i<(numberOfRows-2); i++){
          println("Column:" + str[i]);
      }
      //---------------------------------------------------------
      println("-----------------------------------------");
      println("Data splited");
      //Function get value (Rows,SpecificRow,columnN)
      String row = str[13];
      String [] column = row.split("\\|",-1);
      List cleanedColumn = new ArrayList();
      int numberOfValidData = 0;
      for(int j = 1; j<(column.size()-1);j++){
          if(column[j]!="^"){
              cleanedColumn.add(column[j]);
              numberOfValidData++;
          }
      }
      println("numberOfValidData: "+numberOfValidData);
      println(cleanedColumn);
      println("Size of cleanedColumn:"+cleanedColumn.size())
      
   } 
   
   
}