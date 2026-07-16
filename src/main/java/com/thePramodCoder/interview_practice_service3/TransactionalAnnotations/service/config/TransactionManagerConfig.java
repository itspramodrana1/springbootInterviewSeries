//package com.thePramodCoder.interview_practice_service3.config;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.TransactionDefinition;
//import org.springframework.transaction.support.DefaultTransactionStatus;
//
//
//@Configuration
//public class TransactionManagerConfig {
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
//        return new JpaTransactionManager(emf){
//            @Override
//            protected void doBegin(Object transction, TransactionDefinition definition){
//                super.doBegin(transction, definition);
//                System.out.println("Txn Logger --> New Transaction Started (propagation="
//                                   + definition.getPropagationBehavior() + ") "
//                                       + "(name = " + definition.getName() + ")");
//            }
//
//            @Override
//            protected void doCommit(DefaultTransactionStatus status){
//                super.doCommit(status);
//                System.out.println("Txn Logger --> Transaction CPMMITTED " + "(name = " + status.getTransactionName());
//            }
//
//            @Override
//            protected void doRollback(DefaultTransactionStatus status){
//                super.doRollback(status);
//                System.out.println("Txn Logger --> Transaction ROLLED BACK " + "(name =" + status.getTransactionName());
//            }
//        };
//    }
//}
