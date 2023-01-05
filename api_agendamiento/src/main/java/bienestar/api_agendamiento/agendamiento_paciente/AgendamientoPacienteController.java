package bienestar.api_agendamiento.agendamiento_paciente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/agendamiento_paciente")
@CrossOrigin({"*"})
public class AgendamientoPacienteController {
 @Autowired AgendamientoPacienteService agendamientoPacienteService;
 @GetMapping("/")
 public List<AgendamientoPaciente> findAll(){
 return agendamientoPacienteService.findAll();
 }
 @GetMapping("/{id}/")
 public AgendamientoPaciente findById(@PathVariable Long id){
 return agendamientoPacienteService.findById(id);
 }
 @PostMapping("/")
 public AgendamientoPaciente save(@RequestBody AgendamientoPaciente entity){
 return agendamientoPacienteService.save(entity);
 }
 @PutMapping("/")
 public AgendamientoPaciente update(@RequestBody AgendamientoPaciente entity){
 return agendamientoPacienteService.save(entity);
 }
 @DeleteMapping("/{id}/")
 public void deleteById(@PathVariable Long id){
 agendamientoPacienteService.deleteById(id);
 }
}