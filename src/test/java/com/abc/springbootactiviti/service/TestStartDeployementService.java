package com.abc.springbootactiviti.service;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStartDeployementService {

	
    @Autowired
    private StartDeployementService StartDeployementService;

//    @Autowired
//    private Demo4 demo4;

    @Test
    public void testProcess(){
    	String processDefinitionKey ="";
        processDefinitionKey = "jianguanyi3";
        Map<String, Object> variables= Maps.newHashMap();
        variables.put("userlist",Lists.newArrayList("user05","muser02","group0"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser03","group1"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser04","group2"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser15","group3"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser02","group3"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser03","group3"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser04","group2"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser15","group0"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser02","group3"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser03","group2"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser04","group1"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser15","group0"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    	
        variables.put("userlist",Lists.newArrayList("user05","muser02","group3"));
    	StartDeployementService.startProcessInstance(processDefinitionKey,variables);
    }
	
}
