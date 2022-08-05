package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Vehical;
import com.onboarding_ass4.repos.VehicalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicalServicesImpl implements VehicalServices{

    @Autowired
    public VehicalRepo vehicalRepo;

    @Override
    public String addVehical(Vehical vehical){
        Vehical vehical1=vehicalRepo.save(vehical);
        return vehical1.getRequestId();
    }

    @Override
    public List<Vehical> getAllVehicalDetails(){
        List<Vehical> vehicalList=vehicalRepo.findAll();
        return vehicalList;
    }

    @Override
    public void deleteVehical(String requestId){
        List<Vehical> vehicalList=vehicalRepo.findAll();
        for(int i=0;i< vehicalList.size();i++){
            Vehical vehical1=vehicalList.get(i);
            String reqID=vehical1.getRequestId();
            int flag=0;
            if(reqID.equals(requestId)){        //find vehical with the requestId
                flag=1;
                vehicalRepo.delete(vehical1);
                //customerRepo.fin
                break;
            }
        }
    }



}
