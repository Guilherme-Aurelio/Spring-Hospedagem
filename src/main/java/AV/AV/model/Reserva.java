package AV.AV.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*Atributos: ID, data de início, data de fim, acomodação reservada, hóspede que
realizou a reserva. */

    private Date data_inicio;
    private Date data_fim;
    /*falta acomodacao e hospede*/

}
