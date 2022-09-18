import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Posts } from 'src/app/posts';
import { PostsService } from 'src/app/posts.service';

@Component({
  selector: 'app-new-post',
  templateUrl: './new-post.component.html',
  styleUrls: ['./new-post.component.scss']
})
export class NewPostComponent implements OnInit {

  post : Posts = new Posts('', '')
  posts:Posts [] = [];
  formAction: string | undefined; 

  constructor(private postsSvc: PostsService,  private router: Router) { }

  ngOnInit(): void {
  }

  savePost(){
    this.postsSvc.addPosts(this.post).subscribe(res => {
      this.posts.push(res)
      this.post = new Posts('','')
    })
  }

  comebackhome(){
    this.router.navigate(['/dashboard']);
  }


}
