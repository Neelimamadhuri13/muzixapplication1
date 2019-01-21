package com.stackroute.MuzixApplicationTest1.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Track {
    @Id
    @ApiModelProperty(notes = "The database generated track Id")
    private int Id;
    @ApiModelProperty(notes = "Name of track")
    private String name;
    @ApiModelProperty(notes = "Comment of track")
    private String comments;

}
