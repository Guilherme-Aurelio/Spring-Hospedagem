package AV.AV.model;

import java.util.Date;

/*import org.springframework.format.annotation.DateTimeFormat;*/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="acomodacoes")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Hospede {
    /*ID, nome, data de registro, lista de reservas. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    /*@DateTimeFormat*/
    private Date data_registro; /*(pattern="dd/MM/yyyy")*/

    /*falta reservas */
}
