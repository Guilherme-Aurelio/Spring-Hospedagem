package AV.AV.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="acomodacoes")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Anfitriao {
    
    /*ID, nome, nacionalidade, lista de acomodações disponibilizadas. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; 
    private String nacionalidade;

    


    /*falta acomodações */
}
