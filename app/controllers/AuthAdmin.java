package controllers;


import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Completablefuture;


import models.users.*;


public CompletionStage<Result> call(Http.Context ctx) {

 String id = ctx.session().get("email");
  if (id != null) {
   User u = User.getUserById(id);
   if("admin".equals(u.getRle())) {



    return delegate.call(ctx);

 }


}

return CompletableFuture.completedFuture(redirect(routes.LoginController.login()));

 }



}
