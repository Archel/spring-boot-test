package com.codurance.ddddemo.infrastructure;

import com.codurance.ddddemo.infrastructure.user.UserConverter;
import com.codurance.ddddemo.infrastructure.user.UserDtoPropertyMap;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.convert.support.GenericConversionService;

@Configuration
public class ConversionConfigurationBean {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new UserDtoPropertyMap());
        return modelMapper;
    }

    @Bean
    public ConversionService conversionService(ModelMapper modelMapper) {
        GenericConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new UserConverter(modelMapper));
        return conversionService;
    }
}
