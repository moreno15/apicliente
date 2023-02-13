CREATE DATABASE dbconsulting;

USE [dbconsulting]
GO

INSERT INTO [dbo].[cliente]
           ([apellido_materno]
           ,[apellido_paterno]
           ,[correo]
           ,[direccion]
           ,[fecha_nacimiento]
           ,[nombre]
           ,[sexo])
     VALUES
           ( 
		   'Hinostroza'
		   ,'Moreno' 
		   ,'ronald@example.com'
           ,'Jr tupac Amaru'
           , 15/05/1993
           ,'Ronald Anderson'
           ,'Maculino')
GO


