package br.com.criandoapi.youtube.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
private Integer id;
	
	
	
	@Column(name="email",length=50,nullable=true)
private String email;

	@Column(name="senha",columnDefinition="TEXT",nullable=true)
private String senha;

	

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}

}
/*spring.datasource.url= jdbc:postgresql://localhost:5432/parking-control-db
spring.datasource.username=postgres
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true*/

/*#1-Usuário do banco
spring.datasource.username=developer

# 2- senha do banco
spring.datasource.password=123456

# 3- url para a base de dados

spring.datasource.url=jdbc:mysql://localhost3306/banco_de_usuarios

# 4- dialeto
spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL8Dialect

spring.jpa.hibernate.ddl.auto=update*/


