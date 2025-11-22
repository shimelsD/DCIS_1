/*MALE PATIENTS DIAGNOSIS DATA*/

SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='male'
AND patinet.`Age`<1 /*fetches male aged lessthan 1 yr patients who are diagnosed*/

SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='male'
AND patinet.`Age` BETWEEN 1 AND 4 /*fetches male aged b/n 1 and 4yr patients who are diagnosed*/

 --total nums
   SELECT  dignosis,COUNT(dignosis) AS Total FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='male'
  AND patinet.`Age` BETWEEN 1 AND 4 GROUP BY dignosis

SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='male'
AND patinet.`Age` BETWEEN 5 AND 14 /*fetches male aged b/n 5 and  14 yr patients who are diagnosed*/
 
 --total nums
   SELECT  dignosis,COUNT(dignosis) AS Total FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='male'
  AND patinet.`Age` BETWEEN 5 AND 14 GROUP BY dignosis


SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='male'
AND patinet.`Age` BETWEEN 15 AND 29 /*fetches male aged b/n 15 and  29 yr patients who are diagnosed*/

SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='male'
AND patinet.`Age` BETWEEN 30 AND 64/*fetches male aged b/n 30 and  64 yr patients who are diagnosed*/

SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='male'
AND patinet.`Age`>65 /*fetches male aged age> 65yr patients who are diagnosed*/


/*FEMALE PATIENTS DIAGNOSIS DATA*/

SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='female'
AND patinet.`Age`<1 /*fetches female aged lessthan 1 yr patients who are diagnosed*/

SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='female'
AND patinet.`Age` BETWEEN 1 AND 4 /*fetches female aged b/n 1 and 4yr patients who are diagnosed*/

SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='female'
AND patinet.`Age` BETWEEN 5 AND 14 /*fetches female aged b/n 5 and  14 yr patients who are diagnosed*/


SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='female'
AND patinet.`Age` BETWEEN 15 AND 29 /*fetches female aged b/n 15 and  29 yr patients who are diagnosed*/

//total nums
SELECT  dignosis,COUNT(dignosis) AS Total FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='female'
  AND patinet.`Age` BETWEEN 15 AND 29 GROUP BY dignosis
  

SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='female'
AND patinet.`Age` BETWEEN 30 AND 64/*fetches female aged b/n 30 and  64 yr patients who are diagnosed*/

SELECT * FROM patinet,diagnosis WHERE diagnosis.mrn=patinet.`MRN` AND patinet.`Gender`='female'
AND patinet.`Age`>65 /*fetches female aged age> 65yr patients who are diagnosed*/




