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
@Table(name = "Property")
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idProperty")
    private Integer id;

    @Column(name = "descProperty", nullable = false, length = 100)
    private String descricao;

    @Column(name = "locationProperty", length = 200)
    private String localizacao;
}
