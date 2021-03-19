package com.dtlalala.springcloud.util.testUtil;

import com.dtlalala.springcloud.dao.PaymentDao;
import com.dtlalala.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;

@Slf4j
@Component
public class test {
    @Resource
    private PaymentDao paymentDao;

    @Transactional
    public void createTest() {
        try {
            Payment payment = new Payment();
            payment.setSerial("testTransaction");
            int createCount = 0;
            int deleteCount = 0;
            paymentDao.create(payment);
            log.info("**************CREATE1 TEST: {} " , payment.getId());

            String[] strs= new String[3];
            strs[4] = "1";

            paymentDao.create(payment);
            log.info("**************CREATE2 TEST: {}", payment.getId());
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }
}

