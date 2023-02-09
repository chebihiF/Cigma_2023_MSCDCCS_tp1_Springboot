package org.cigma.tp1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Details {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private int qte ;
    private double price;
    @ManyToOne // n ---> 1
    private Product product;
    @ManyToOne
    private Command command;
}
