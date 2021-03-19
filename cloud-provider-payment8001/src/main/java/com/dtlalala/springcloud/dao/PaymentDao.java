package com.dtlalala.springcloud.dao;

import com.dtlalala.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public int delete(@Param("id") Long id);

    public Payment getPaymentById(@Param("id") Long id);
}
