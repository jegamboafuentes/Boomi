# Dell Boomi


#### This repository has been created to sumbit custom Scripting [Groovy and JavaScript] for Data Process (Custom Scripting) shapes in Boomi

### Groovy Scripts [2]
  - Boomi_Data_Manipulation.groovy
  - SANDBOX - Boomi_Data_Manipulation.groovy
### JavaScript Scripts [0]

#### Boomi_Data_Manipulation.groovy

Is a Groovy class (Groovy version 1.5) which has librarys of Boomi, this class (Copy-Paste in Script Editor) is meant to get data from Stream, manipulate data (Example manipulate rows and columns from a Data Base), the main functionality of this Script is to manipulate/edit/transform data from an incoming stream in Boomi, it could be a DB or another conection, in this script you can do any kind of transformation of each part of data.

The data this script is getting as a document in Boomi is a whole string of data from stream boomi:


```sh
"DBSTART|a6b5e62f-bb11-4fcc-bf26-493ee966b793|2|@|BEGIN|2|@|OUT_START|3|@|1|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|-|^||#|2|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|-|^||#|3|^||^||^||^||^|561|^|Receipt to unrestricted stock|^|Plant|^|4900068091|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|4|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|5|^||^||^||^||^|561|^|Receipt to unrestricted stock|^|Plant|^|4900068091|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|6|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110079|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|1|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|-|^||#|2|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|-|^||#|3|^||^||^||^||^|561|^|Receipt to unrestricted stock|^|Plant|^|4900068091|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|4|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|5|^||^||^||^||^|561|^|Receipt to unrestricted stock|^|Plant|^|4900068091|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|6|^||^||^||^||^|322|^|Reverse: QM Confirm Stock at Plant|^|Plant|^|4900109864|^|000000000000110091|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|EMPT|^|KRB6|^|SER03|^|+|^||#|1|^||^||^||^||^|311|^|SLOC move at plant|^|Plant|^|4900060264|^|000000000000140050|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|NRRT|^|KRB6|^|SER03|^|-|^||#|2|^||^||^||^||^|311|^|SLOC move at plant|^|Plant|^|4900064005|^|000000000000140050|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|FULL|^|KRB6|^|SER03|^|-|^|PLTKRB6|#|3|^||^||^||^||^|311|^|SLOC move at plant|^|Plant|^|4900067175|^|000000000000140050|^||^|000000000000156691|^|000000000000156691|^|RV_8I4000S_H_NF3__US__U___200B_A|^|KRB6|^|NRRT|^|KRB6|^|SER03|^|-|^||#||#|OUT_END|3|@|END|2|@|DBEND|a6b5e62f-bb11-4fcc-bf26-493ee966b793|2|@|"
```
This information is flat data from an Azure Data Base, this data contains 20 columns and 15 rows of data, **This Script works with N number of columns and N number of rows**, there is not limination on data. 

### Instalation

Just copyng, and pasting the script into your custom script process type in Data Process Shape of data in Boomi.

Just add your logic in the special section. 
```sh
// --------- Logic here
              logger.info("Data: " + currentData.get(j));
// --------- End Logic
```
#### SANDBOX - Boomi_Data_Manipulation.groovy
It is just a logic SANDBOX used to develop the script `Boomi_Data_Manipulation.groovy` this class doens't have anithing to do with Boomi solutions, however the reader can test the logic following this [Link](http://tpcg.io/kz7jfF)
