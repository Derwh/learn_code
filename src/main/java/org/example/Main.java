package org.example;

import org.apache.commons.beanutils.BeanUtils;
import org.example.converter.ConverterSetting;
import org.example.dto.PersonDto;
import org.example.po.PersonPo;
import org.springframework.cglib.beans.BeanCopier;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        PersonPo personPo = new PersonPo();
        personPo.setId(1);
        personPo.setName("张三");
//        List<String> phoneNumberList = new ArrayList<String>() {{
//            add("123456789");
//            add("987654321");
//        }};
//        personPo.setPhoneNumberList(phoneNumberList);

        PersonDto personDto = new PersonDto();
        BeanCopier beanCopier = BeanCopier.create(personPo.getClass(), personDto.getClass(), true);
        beanCopier.copy(personPo, personDto, new ConverterSetting());

        System.out.println(personPo);
        System.out.println(personDto);

//        phoneNumberList.add("135792468");

        System.out.println(personPo);
        System.out.println(personDto);
    }
}