 

CREATE PROCEDURE eliminarCliente
  @id INT

AS

BEGIN
 

    delete from cliente where id=@id;

END;