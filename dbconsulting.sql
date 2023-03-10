USE [dbconsulting]
GO
/****** Object:  Table [dbo].[cliente]    Script Date: 13/02/2023 16:28:28 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cliente](
	[id] [numeric](19, 0) IDENTITY(1,1) NOT NULL,
	[apellido_materno] [varchar](255) NULL,
	[apellido_paterno] [varchar](255) NULL,
	[correo] [varchar](255) NULL,
	[direccion] [varchar](255) NULL,
	[fecha_nacimiento] [datetime] NULL,
	[nombre] [varchar](255) NULL,
	[sexo] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  StoredProcedure [dbo].[eliminarCliente]    Script Date: 13/02/2023 16:28:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[eliminarCliente]
  @id INT

AS

BEGIN
 

    delete from cliente where id=@id;

END;
GO
