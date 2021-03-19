package com.dtlalala.springcloud.service.impl;

import com.dtlalala.springcloud.dao.PaymentDao;
import com.dtlalala.springcloud.entities.Payment;
import com.dtlalala.springcloud.service.PaymentService;
import com.dtlalala.springcloud.util.testUtil.test;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;

@Service
@Slf4j
//@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Autowired
    private com.dtlalala.springcloud.util.testUtil.test test;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int test() {
        test.createTest();
        return -1;
    }

}
