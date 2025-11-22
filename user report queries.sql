--user report queries

--Total nurse aggregated by sex

SELECT gender AS Gender ,COUNT(*) AS Total,(SELECT COUNT(*) FROM nurse) AS Total_nurses FROM nurse GROUP BY gender
--Total dentists aggregated by sex
SELECT gender AS Gender ,COUNT(*) AS Total,(SELECT COUNT(*) FROM dentists) AS Total_dentists FROM dentists GROUP BY dentists.gender 
--Total pharmacists aggregated by sex
SELECT gender AS Gender ,COUNT(*) AS Total,(SELECT COUNT(*) FROM pharmacist) AS Total_pharmacist FROM pharmacist GROUP BY gender
--Total userss aggregated by sex
SELECT gender,COUNT(*) AS Total ,(SELECT COUNT(*) FROM allusers) AS Total_users FROM allusers GROUP BY gender