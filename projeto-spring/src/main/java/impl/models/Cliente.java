package impl.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Client")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idClient")
    private Integer id;

    @Column(name="nameClient", nullable = false, length = 50)
    private String nome;

    @Column(name="securityNumber", unique = true, 
        nullable = false, length = 11)
    private String cpf;
    
    @Column(name="emailClient", unique = true, nullable = false)
    private String email;
}
