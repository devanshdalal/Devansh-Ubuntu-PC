let rec sort lst =
   match lst with
     [] -> []
   | head :: tail -> insert head (sort tail)
 and insert elt lst =
   match lst with
     [] -> [elt]
   | head :: tail -> if elt <= head then elt :: lst else head :: insert elt tail
 ;;
 
 sort([1,4,3,2,4,5]);;
