package bienestar.api_agendamiento.agendamiento_psicologo;
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
@RequestMapping("api/agendamiento_psicologo")
@CrossOrigin({"*"})
public class AgendamientoPsicologoController {
 @Autowired AgendamientoPsicologoService agendamientoPsicologoService;
 @GetMapping("/")
 public List<AgendamientoPsicologo> findAll(){
 return agendamientoPsicologoService.findAll();
 }
 @GetMapping("/{id}/")
 public AgendamientoPsicologo findById(@PathVariable Long id){
 return agendamientoPsicologoService.findById(id);
 }
 @PostMapping("/")
 public AgendamientoPsicologo save(@RequestBody AgendamientoPsicologo entity){
 return agendamientoPsicologoService.save(entity);
 }
 @PutMapping("/")
 public AgendamientoPsicologo update(@RequestBody AgendamientoPsicologo entity){
 return agendamientoPsicologoService.save(entity);
 }
 @DeleteMapping("/{id}/")
 public void deleteById(@PathVariable Long id){
 agendamientoPsicologoService.deleteById(id);
 }
}
