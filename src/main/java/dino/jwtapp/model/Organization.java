package dino.jwtapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "organizations")
@Data
public class Organization
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "contact_person")
    private String contactPerson;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;
}
