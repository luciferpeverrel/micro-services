package com.example.demo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Integer carId;
    @NotNull
    @NotEmpty
    private String carName;
    @NotNull
    private long carPrice;

}
