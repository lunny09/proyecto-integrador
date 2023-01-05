package bienestar.api_agendamiento.agendamiento_psicologo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AgendamientoPsicologoService {
 @Autowired AgendamientoPsicologoRepository agendamientoPsicologoRepository;
 public AgendamientoPsicologo save(AgendamientoPsicologo entity){
 return agendamientoPsicologoRepository.save(entity);
 }
 public AgendamientoPsicologo findById( Long id){
 return agendamientoPsicologoRepository.findById(id).orElse(new AgendamientoPsicologo());
 }
 public void deleteById(Long id){
 agendamientoPsicologoRepository.deleteById(id);
 }
 public List<AgendamientoPsicologo> findAll(){
 return agendamientoPsicologoRepository.findAll();
 }
}