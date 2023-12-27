CREATE TABLE reserva( 
    /*ID, data de início, data de fim, acomodação reservada, hóspede que
realizou a reserva.*/
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_inicio TIMESTAMP NOT NULL,
    data_fim TIMESTAMP NOT NULL,
    acomodacao_id INT, 
    hospede_id INT;

     ALTER TABLE reserva ADD CONSTRAINT fk_acomodacao FOREIGN KEY (acomodacao_id) REFERENCES acomodacao(id);
     ALTER TABLE reserva ADD CONSTRAINT fk_hospede FOREIGN KEY (hospede_id) REFERENCES hospede(id);

);