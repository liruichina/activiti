package com.abc.springbootactiviti.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.abc.springbootactiviti.demo.AotoRunTestData;
import com.abc.springbootactiviti.demo.TestList2;
import com.abc.springbootactiviti.demo.beans.ProcessNode;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProcessDeployementService {
	
    @Autowired
    private ProcessDeployementService processDeployementService;

//    @Autowired
//    private Demo4 demo4;

    @Test
    public void testProcess(){
    	String taskId ="310002";
    	processDeployementService.complete(taskId);
    }
    
}
