package cn.bincker.web.blog.base.entity.converter;

import cn.bincker.web.blog.base.entity.Role;
import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RoleConverter implements AttributeConverter<Set<Role>, String> {
    @Override
    public String convertToDatabaseColumn(Set<Role> roles) {
        return roles.stream().map(Role::getCode).collect(Collectors.joining(","));
    }

    @Override
    public Set<Role> convertToEntityAttribute(String s) {
        if(!StringUtils.hasText(s)) return Collections.emptySet();
        return Stream.of(s.split(",")).map(r -> Role.RoleEnum.valueOf(r).toRole()).collect(Collectors.toSet());
    }
}
