package bienestar.api_agendamiento.agendamiento_paciente;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AgendamientoPacienteService {
 @Autowired AgendamientoPacienteRepository agendamientoPacienteRepository;
 public AgendamientoPaciente save(AgendamientoPaciente entity){
 return agendamientoPacienteRepository.save(entity);
 }
 public AgendamientoPaciente findById( Long id){
 return agendamientoPacienteRepository.findById(id).orElse(new AgendamientoPaciente());
 }
 public void deleteById(Long id){
 agendamientoPacienteRepository.deleteById(id);
 }
 public List<AgendamientoPaciente> findAll(){
 return agendamientoPacienteRepository.findAll();
 }
}