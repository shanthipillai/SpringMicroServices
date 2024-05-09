package com.eazybytes.cards.dto;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ConfigurationProperties(prefix="accounts")
public record CardsContactsInfoDto(String message , Map<String,String> contactDetails, List<String> onCallSupport) {

}