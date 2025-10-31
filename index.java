const REFORMA_DATA = "31-10-1517";
const THESES_COUNT = 95;

function verificar_achievement_wittenberg(usuario, data_atual) {
    if (data_atual.dia === 31 && data_atual.mes === 10) {
        let numero_de_commits = get_commit_count(usuario, data_atual);

        if (numero_de_commits >= THESES_COUNT) {
            desbloquear_achievement(usuario, "Push para Wittenberg");
            return true;
        }
    }
  
    return false;
}
