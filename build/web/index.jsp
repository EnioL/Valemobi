<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Batch</title>       
    </head>

    <body>

       
        <h3 class="panel-title">Cadastro de Customers</h3>        
        
        <div>
            <form class="form-horizontal" role="form" method="POST" action="Inserir">

                <input type="hidden" name="id" value="0"/>                
                
                <div class="form-group ">
                    <label class="control-label col-sm-2" for="identi">ID</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="identi" id="identi" placeholder="Digite o id" value="">
                    </div>
                </div>
                
                <div class="form-group ">
                    <label class="control-label col-sm-2" for="cpf">CPF</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="cpf" id="cpf" placeholder="Digite o cpf" value="">
                    </div>
                </div>
                <div class="form-group ">
                    <label class="control-label col-sm-2" for="nome">Nome</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="nome" id="nome" placeholder="Digite o nome" value="">
                    </div>
                </div>
                
                <div class="form-group">
                    <label class="control-label col-sm-2" for="active">Ativo</label>
                    <div class="col-sm-10">
                        <select class="form-control" id="ativo" name="ativo">
                            <option selected value="true">Sim</option>
                            <option  value="false">Não</option>     
                        </select>
                    </div>
                </div>

                <div class="form-group ">
                    <label class="control-label col-sm-2" for="total">Valor Total</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="total" id="total" placeholder="Digite o Valor Total" value="">
                    </div>
                </div>

                    <div class="form-group" >
                        <div class="col-sm-offset-2 col-sm-10">
                            <div class="btn-toolbar">
                                <button type="submit" class="btn btn-default btn pull-right">Gravar</button>                                
                                <button type= 'button' onclick="javascript:window.location='Inserir?media'" class='btn btn-primary'>Media</button>                                
                            </div>
                        </div>

                    </div>


                </form>
        </div>
        

        <script>
            $(document).ready(function () {
                $(".close").click(function () {
                    $("#myAlert").alert("close");
                });
            });
            function media() {
            $(location).attr('href', "Inserir?media");
            }
        </script>
        
        
    </body>
</html>

