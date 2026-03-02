package com.mycompany.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "class")
public class ArtClass {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "class_id")
  private int id;

  @Column(name = "class_name")
  private String name;

  @Column(name = "day_of_week")
  private String dayOfWeek;

  public int getId() {
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
}
