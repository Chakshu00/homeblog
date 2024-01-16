package com.homeblog.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="home")
@AllArgsConstructor
@NoArgsConstructor
@Data //Automatically getters and setters are imported by this. This is imported from lombok
@Entity
public class Home {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String title;
private String description;
private String content;
}
