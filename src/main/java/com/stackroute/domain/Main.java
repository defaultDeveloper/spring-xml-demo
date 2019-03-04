package com.stackroute.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Movie movie=(Movie) context.getBean("movieA");
       // System.out.println(movie.toString());
        Movie movie1=(Movie)context.getBean("movieB");
        System.out.println(movie==movie1);
//
//        ClassPathResource resource = new ClassPathResource("bean.xml");
//
//        BeanFactory factory=new XmlBeanFactory(resource);
//        Movie movie1=(Movie) factory.getBean("movie");
//        System.out.println("Using XmlBeanFactory");
//        System.out.println(movie1.toString());
//
//        BeanDefinitionRegistry definitionRegistry= new XmlBeanFactory(resource);
//        Movie movie2= (Movie)((XmlBeanFactory) definitionRegistry).getBean("movie");
//        System.out.println("Using BeanDefinitionRegistry");
//        System.out.println(movie2.toString());
    }
}