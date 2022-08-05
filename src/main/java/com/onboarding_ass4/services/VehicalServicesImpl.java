package com.onboarding_ass4.services;

import com.onboarding_ass4.model.Customer;
import com.onboarding_ass4.model.Vehical;
import com.onboarding_ass4.repos.VehicalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

        Vehical vehical=vehicalRepo.findVehicalById(requestId);
        vehicalRepo.delete(vehical);

//        List<Vehical> vehicalList=vehicalRepo.findAll();
//        for(int i=0;i< vehicalList.size();i++){
//            Vehical vehical1=vehicalList.get(i);
//            String reqID=vehical1.getRequestId();
//            if(reqID.equals(requestId)){
//                vehicalRepo.delete(vehical1);
//                //customerRepo.fin
//                break;
//            }
//        }
    }

    @Override
    public Vehical updateVehical(String requestId,Vehical vehical) {

        Vehical vehical1=vehicalRepo.findVehicalById(requestId);
        //update requestId
        if(Objects.nonNull(vehical.getRequestId())&&"".equalsIgnoreCase(vehical.getRequestId())){
            vehical1.setRequestId(vehical.getRequestId());
        }
        //update Vertical
        if(Objects.nonNull(vehical.getVertical())&&"".equalsIgnoreCase(vehical.getVertical())){
            vehical1.setVertical(vehical.getVertical());
        }
        //update Insurer_name
        if(Objects.nonNull(vehical.getInsurer_name())&&"".equalsIgnoreCase(vehical.getInsurer_name())){
            vehical1.setInsurer_name(vehical.getInsurer_name());
        }
        //update Make
        if(Objects.nonNull(vehical.getMake())&&"".equalsIgnoreCase(vehical.getMake())){
            vehical1.setMake(vehical.getMake());
        }
        //Update Model
        if(Objects.nonNull(vehical.getModel())&&"".equalsIgnoreCase(vehical.getModel())){
            vehical1.setModel(vehical.getModel());
        }
        //update Premium
        if(Objects.nonNull(vehical.getPremium())&&"".equalsIgnoreCase(vehical.getPremium())) {
            vehical1.setPremium(vehical.getPremium());
        }
        return vehical1;
    }


}
