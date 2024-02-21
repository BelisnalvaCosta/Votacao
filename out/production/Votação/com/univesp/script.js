 const urnaEletronicaList = document.getElementById('urnaEletronica')
    ew URLSearchParams(window.location.search).forEach(
        (value, name)=>{
            urnaEletronicaList.append('${name}: ${value}')
            urnaEletronicaList.append(document.createElement('br'))
            }
        }