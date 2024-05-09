package com.training.springbootwebconcepts.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MoreDtoManipulations {
List<UserReqisterDto2> userslist;
List<UserAddress> useraddr;

}
