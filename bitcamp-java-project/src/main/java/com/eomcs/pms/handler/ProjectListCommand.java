package com.eomcs.pms.handler;

import java.util.Iterator;
import java.util.List;
import com.eomcs.pms.domain.Project;

// '/board/add' 명령을 처리할 커드 객체
public class ProjectListCommand implements Command {

  List<Project> projectList;
  MemberListCommand memberListCommand;

  public ProjectListCommand(List<Project> list, MemberListCommand memberListCommand) {
    this.projectList = list;
    this.memberListCommand = memberListCommand;
  }

  @Override
  public void execute() {
    System.out.println("[프로젝트 목록]");

    // 전체 목록을 조회할 때 `Iterator` 객체를 사용한다.
    // 만약 목록의 일부만 조회하면다면 인덱스를 직접 다루는 이전 방식을 사용해야 한다.
    Iterator<Project> iterator = projectList.iterator();

    while (iterator.hasNext()) {
      Project project = iterator.next();
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n",
          project.getNo(),
          project.getTitle(),
          project.getStartDate(),
          project.getEndDate(),
          project.getOwner(),
          project.getMembers());
    }
  }
}

