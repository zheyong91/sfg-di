package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService{
	@Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
