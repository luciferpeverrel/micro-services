package com.example.demo.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Integer carsId;
    @NotNull
    @NotEmpty
    private String carName;
    @NotNull
    @NotEmpty
    private long carPrice;
}
