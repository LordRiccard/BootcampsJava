package impl.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Rented")
public class ImoveisAlugados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idRented")
    private Integer id;

    @JoinColumn(name = "idClientRenter", 
        referencedColumnName = "idClient", nullable = false)
    private Integer idCliente;

    @JoinColumn(name = "idRentedProperty", 
        referencedColumnName = "idProperty", nullable = false)
    private Integer idImovel;

    @Column(name = "startDate", nullable = false)
    private Date dataInicio;

    @Column(name = "typeContract", nullable = false)
    private String contrato;
}
