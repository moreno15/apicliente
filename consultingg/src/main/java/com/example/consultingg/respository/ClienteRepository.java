package com.example.consultingg.respository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable; 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.consultingg.entity.Cliente; 
@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long>{
	
	/*
	  @Query(value = "SELECT p FROM Cita p WHERE p.estado_cita=0")
	  Page<Cita> citasPendientePago(Pageable pageable);  
	  //c.estado_cita=:estado_cita   ventas cita
	  @Query(value = "SELECT * FROM cita c WHERE c.dni =:estado_cita AND c.atencion=:atencion AND  c.estado_cita=:pagado ", nativeQuery = true)
	  Page<Cita> citasFechaFiltroEstadopAGO(Pageable pageable,@Param("estado_cita") String estado_cita,@Param("atencion") String atencion,@Param("pagado") String pagado ); 
	  
	  //c.estado_cita=:estado_cita listar cita //LISTAR CITAS
	  @Query(value = "SELECT * FROM cita c WHERE c.fecha_cita=:fecha_cita AND c.estado_cita=:estado_cita", nativeQuery = true)
	  Page<Cita> citasFechaFiltroEstado(Pageable pageable, @Param("fecha_cita") String fecha_cita,@Param("estado_cita") String estado_cita ); 
	  
	  @Query(value = "SELECT * FROM cita c WHERE c.fecha_cita=:fecha_cita ", nativeQuery = true)
	  Page<Cita> citasFechaFiltroEstadoAll(Pageable pageable, @Param("fecha_cita") String fecha_cita );  
	  
	  
	  @Query(value = "SELECT * FROM cita c WHERE c.fecha_cita=:fecha_cita AND  nombre_paciente LIKE %:name%", nativeQuery = true)
	  Page<Cita> listarCitaFechaEstadoAllName(Pageable pageable, @Param("fecha_cita") String fecha_cita, @Param("name") String name ); 
	  
	  
	  
 
	//LISTAR TRIAJE se agrego fecha fin
	  @Query(value = "SELECT * FROM cita c WHERE c.fecha_cita BETWEEN :fecha_cita AND :fecha_fin AND c.estado_triaje=:estado_cita AND c.estado_cita=1 AND c.estado_confirm=1", nativeQuery = true)
	  Page<Cita> citasFechaFiltroEstadoTriaje(Pageable pageable, @Param("fecha_cita") String fecha_cita,@Param("fecha_fin") String fecha_fin,@Param("estado_cita") String estado_cita ); 

	  @Query(value = "SELECT * FROM cita c WHERE c.fecha_cita BETWEEN :fecha_cita AND :fecha_fin AND c.estado_cita=1 AND c.estado_confirm=1", nativeQuery = true)
	  Page<Cita> citasFechaFiltroEstadoTriajeAll(Pageable pageable, @Param("fecha_cita") String fecha_cita,@Param("fecha_fin") String fecha_fin ); 
	  
	  @Query(value = "SELECT * FROM cita c WHERE c.fecha_cita BETWEEN :fecha_cita AND :fecha_fin AND c.estado_cita=1 AND c.estado_confirm=1 AND  nombre_paciente LIKE %:name%", nativeQuery = true)
	  Page<Cita> citasFechaFiltroEstadoTriajeAllName(Pageable pageable, @Param("fecha_cita") String fecha_cita, @Param("fecha_fin") String fecha_fin, @Param("name") String name ); 
	  
	  
	  
	  
	  @Query(value = "SELECT * FROM cita c WHERE c.fecha_cita=:fecha_cita AND c.id_medico=:id_medico", nativeQuery = true)
	  Page<Cita> citasFechaFiltroCitaMedicoHoy(Pageable pageable, @Param("fecha_cita") String fecha_cita,String id_medico  ); 
	  
	  
	  //reporte
	  @Query(value = "SELECT * FROM cita c WHERE c.fecha_cita BETWEEN :fecha_ini AND :fecha_fin AND c.id_servicio=:id_servicio", nativeQuery = true)
	  List<Cita> citasreporteFecha( @Param("fecha_ini") String fecha_ini,@Param("fecha_fin") String fecha_fin,@Param("id_servicio") String id_servicio) ;	  
*/
}
