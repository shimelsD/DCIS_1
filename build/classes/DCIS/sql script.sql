create database DCIS_DB;
use DCIS_DB;

create table useraccount (
	 ID varchar(50)  not null,
     Username varchar(50)  not null,
     Password varchar(50)  not null,
     Role varchar(20) not null,
     Primary key(Username));
create table Dentists (
     DentistID varchar(50) not null  Primary key,
     Username varchar(50) not null,
     Name varchar(50)  not null,
     Gender varchar(5) not null,
     Age int not null,
     Qualification varchar(50)  not null,
     Address varchar(50)  not null,
     Contact varchar(50)  not null,
	 CONSTRAINT FK_DentistUsrAcc FOREIGN KEY (Username) REFERENCES useraccount(Username) ON DELETE CASCADE ON UPDATE CASCADE);
     
create table nurse(
      NurseID varchar(50) not null primary key,
	  Username varchar(50)  not null,
      Name varchar(50) not null,
      Gender varchar(50) not null,
	  Age int not null,
      Qualification varchar(50) not null,
      Address varchar(50) not null,
      Contact varchar(50) not null,
      CONSTRAINT FK_NurseUsrAcc FOREIGN KEY (Username) REFERENCES useraccount(Username) ON DELETE CASCADE ON UPDATE CASCADE);
                   
create table pharmacist(
       PharmacistID varchar(50) not null primary key,
	   Username varchar(50)  not null,
       Name varchar(50) not null,
       Gender varchar(50) not null,
	   Age int not null,
	   Qualification varchar(50) not null,
	   Address varchar(50) not null,
       Contact varchar(50) not null,
       CONSTRAINT FK_PharmacistUsrAcc FOREIGN KEY (Username) REFERENCES useraccount(Username) ON DELETE CASCADE ON UPDATE CASCADE);
 create table Pt_History (
                        PtHistoryID varchar(50) not null primary key,
                        MRN varchar(8) not null,
                        Bed_No varchar(20) not null,
                        Ward varchar(20) not null,
                        ChiefComplaint varchar(500),
					    PresentIllness varchar(500),
						constraint fkptHistoryPt FOREIGN KEY (MRN) REFERENCES patinet(MRN) on delete cascade on update cascade);


create table diagnosis (DignosisID varchar(50) not null primary key,
                        MRN varchar(8) not null,
                        DentistID varchar(50) not null,
                        DiagnosisDate date,
                        PtCondition varchar(100) not null,
                        Activity varchar(100) not null,
                        VitalSign varchar(100) not null,
                        Diet varchar(100) not null,
                        NursingCare varchar(100) not null,
                        Investigation varchar(100) not null,
                        Treatments varchar(100) not null,
						constraint DentistDiagnosis_fk foreign key (DentistID) references Dentists(DentistID) on delete cascade on update cascade,
					    constraint ptDiagnosis_fk foreign key (MRN) references patinet(MRN) on delete cascade on update cascade);


create table Procedures(ProcedureID varchar(50) not null primary key,
                        MRN varchar(8) not null,
                        DentistID varchar(50) not null, 
                        PreOpDx varchar(100) not null,
                        PostOpDx varchar(100) not null,
                        Procedures varchar(100) not null,
                        Findings varchar(500) not null,
                        EstimatedBloddLoss varchar(100) not null,
                        FluidGiven varchar(100) not null,
                        Drains varchar(100) not null,
                        Specimen varchar(100) not null,
						constraint ptProcedure_fk foreign key (MRN) references patinet(MRN) on delete cascade on update cascade,
						constraint Dentistprocedure_fk foreign key (DentistID) references Dentists(DentistID) on delete cascade on update cascade);
   
       
Insert into useraccount(Id,Username,password,Role) values('D001', 'dany','dany123','Dentist');
Insert into useraccount(Id,Username,password,Role) values('A001', 'shime','shime','Adminstrator');
  
INSERT INTO `dcis`.`dentists` (`DentistID` ,`Username` ,`Name` ,`Gender` ,`Age` ,`Qualification` ,`Address` ,`Contact`)
VALUES ('D001', 'dany', 'Daniel wou', 'M', '25', 'Bsc', 'NYC', '+54367289384765');




/*SQL QUERY TO SHOW ALL USERS FROM DENTISTS,NURSE AND USERACCOUNT TABLES */
/*select DentistID as ID,dentists.Username,Name as Full_Name,Gender,Age,Qualification,Address,Contact,useraccount.role from dentists,useraccount 
where useraccount.Username =dentists.Username UNION ALL
select NurseID as ID,nurse.Username,Name as Full_Name,Gender,Age,Qualification,Address,Contact,useraccount.role from nurse,useraccount 
where useraccount.Username =nurse.Username UNION ALL
select PharmacistID as ID,pharmacist.Username,Name as Full_Name,Gender,Age,Qualification,Address,Contact,useraccount.role from pharmacist,useraccount 
where useraccount.Username =pharmacist.Username;
*/

/*CREATE VIEW FROM ALL USERS*/

CREATE VIEW allUsers as
select DentistID as ID,dentists.Username,Name as Full_Name,Gender,Age,Qualification,Address,Contact,useraccount.role from dentists,useraccount 
where useraccount.Username =dentists.Username UNION ALL
select NurseID as ID,nurse.Username,Name as Full_Name,Gender,Age,Qualification,Address,Contact,useraccount.role from nurse,useraccount 
where useraccount.Username =nurse.Username UNION ALL
select PharmacistID as ID,pharmacist.Username,Name as Full_Name,Gender,Age,Qualification,Address,Contact,useraccount.role from pharmacist,useraccount 
where useraccount.Username =pharmacist.Username;





