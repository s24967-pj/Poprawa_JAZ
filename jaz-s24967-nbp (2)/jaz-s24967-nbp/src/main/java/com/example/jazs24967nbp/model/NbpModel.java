package com.example.jazs24967nbp.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class NbpModel {

   private Integer id;
   private Material material;
   private Date date_from;
   private Date date_to;
   private double value;
   private Date query_time;

    public NbpModel() {
    }

    public NbpModel(Integer id, Material material, Date date_from, Date date_to, double value, Date query_time) {
        this.id = id;
        this.material = material;
        this.date_from = date_from;
        this.date_to = date_to;
        this.value = value;
        this.query_time = query_time;
    }

    public enum Material
    {
        Gold
    }
}
