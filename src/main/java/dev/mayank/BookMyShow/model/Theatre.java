package dev.mayank.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "THEATRE")
public class Theatre extends BaseModel{
private String name;
private String address;
@OneToMany
private List<Auditorium> auditoriumList;
}
