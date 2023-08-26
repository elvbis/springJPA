package pe.spring.jpa.repository.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cp_type_document")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class DocumentEntity {

	@Id
	@Column(name="typ_doc_code")
	private String id;
	
	@Column(name="descripcion")
	private String descripcion;

	@Column(name="status")
	private int status;
	


}
