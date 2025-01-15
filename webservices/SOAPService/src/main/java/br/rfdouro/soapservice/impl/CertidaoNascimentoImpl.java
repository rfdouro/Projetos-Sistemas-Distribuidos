package br.rfdouro.soapservice.impl;

import br.rfdouro.soapservice.spec.CertidaoNascimento;
import jakarta.jws.WebService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author romulo
 */
@WebService(endpointInterface = "br.rfdouro.soapservice.spec.CertidaoNascimento")
public class CertidaoNascimentoImpl implements CertidaoNascimento {

 private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

 @Override
 public int calculaIdade(String dtNascimento) {
  int calc = 0;
  try {
   Calendar dtNasc = Calendar.getInstance();
   Date idade = sdf.parse(dtNascimento);
   dtNasc.setTime(idade);

   Calendar hoje = Calendar.getInstance();
   calc = hoje.get(Calendar.YEAR) - dtNasc.get(Calendar.YEAR);
   if (hoje.get(Calendar.MONTH) < dtNasc.get(Calendar.MONTH)) {
    calc--;
   } else if (hoje.get(Calendar.MONTH) == dtNasc.get(Calendar.MONTH)
           && hoje.get(Calendar.DAY_OF_MONTH) < dtNasc.get(Calendar.DAY_OF_MONTH)) {
    calc--;
   }
  } catch (ParseException e) {
  }
  return calc;
 }

 @Override
 public String diaSemanaNascimento(String dtNascimento) {
  String[] dias = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"};
  int dia = 0;
  try {
   Calendar dtNasc = Calendar.getInstance();
   Date idade = sdf.parse(dtNascimento);
   dtNasc.setTime(idade);
   dia = dtNasc.get(Calendar.DAY_OF_WEEK);
  } catch (Exception e) {
  }
  return dias[dia];
 }

}
