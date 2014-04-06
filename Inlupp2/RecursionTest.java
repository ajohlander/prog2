




<!DOCTYPE html>
<html class="   ">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    
    <title>Prog2/ou2/RecursionTest.java at master · TDB-UU/Prog2</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="TDB-UU/Prog2" name="twitter:title" /><meta content="Prog2 - Course content for Programming II" name="twitter:description" /><meta content="https://avatars3.githubusercontent.com/u/7020995?s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars3.githubusercontent.com/u/7020995?s=400" property="og:image" /><meta content="TDB-UU/Prog2" property="og:title" /><meta content="https://github.com/TDB-UU/Prog2" property="og:url" /><meta content="Prog2 - Course content for Programming II" property="og:description" />

    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />

    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="4D357242:5DB4:EB1AF8:533BEEC3" name="octolytics-dimension-request_id" /><meta content="6873683" name="octolytics-actor-id" /><meta content="ajohlander" name="octolytics-actor-login" /><meta content="e01a939f3595e672219520f5abef1f563de0118b28e908e582cfa0c7337d32cd" name="octolytics-actor-hash" />
    

    
    
    <link rel="icon" type="image/x-icon" href="https://github.global.ssl.fastly.net/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="iEfhUKelZfnSN5RXUXakPO0fe4dTSQoqumyUiVQ8q2k=" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-927f0bd30c92b2f1f72bead5d0086b25492d8375.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-db8f6f9bbe1b0e611d0e24fc905420b0c99729f2.css" media="all" rel="stylesheet" type="text/css" />
    


        <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-dca097f6f454ee06b43ea4817a154392e3caf824.js" type="text/javascript"></script>
        <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-8f50ef8d73fe0d7e132fe0703ddfb1928cf847fa.js" type="text/javascript"></script>
        
        
      <meta http-equiv="x-pjax-version" content="f69f05f1dc5a6f45a089ae04efd636e9">

        <link data-pjax-transient rel='permalink' href='/TDB-UU/Prog2/blob/9fa4222141263c99a4488720f13835204207fea4/ou2/RecursionTest.java'>

  <meta name="description" content="Prog2 - Course content for Programming II" />

  <meta content="7020995" name="octolytics-dimension-user_id" /><meta content="TDB-UU" name="octolytics-dimension-user_login" /><meta content="17975530" name="octolytics-dimension-repository_id" /><meta content="TDB-UU/Prog2" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="17975530" name="octolytics-dimension-repository_network_root_id" /><meta content="TDB-UU/Prog2" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/TDB-UU/Prog2/commits/master.atom" rel="alternate" title="Recent Commits to Prog2:master" type="application/atom+xml" />

  </head>


  <body class="logged_in  env-production linux vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/">
  <span class="mega-octicon octicon-mark-github"></span>
</a>

    
    <a href="/notifications" aria-label="You have no unread notifications" class="notification-indicator tooltipped tooltipped-s" data-gotokey="n">
        <span class="mail-status all-read"></span>
</a>

      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<div class="commandbar">
  <span class="message"></span>
  <input type="text" data-hotkey="/ s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    data-username="ajohlander"
      data-repo="TDB-UU/Prog2"
      data-branch="master"
      data-sha="4dbdbe3a6fb8a93052bb16a4ffb9eded261a6677"
  >
  <div class="display hidden"></div>
</div>

    <input type="hidden" name="nwo" value="TDB-UU/Prog2" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    


  <ul id="user-links">
    <li>
      <a href="/ajohlander" class="name">
        <img alt="Andreas Johlander" class=" js-avatar" data-user="6873683" height="20" src="https://avatars3.githubusercontent.com/u/6873683?s=140" width="20" /> ajohlander
      </a>
    </li>

    <li class="new-menu dropdown-toggle js-menu-container">
      <a href="#" class="js-menu-target tooltipped tooltipped-s" aria-label="Create new...">
        <span class="octicon octicon-plus"></span>
        <span class="dropdown-arrow"></span>
      </a>

      <div class="new-menu-content js-menu-content">
      </div>
    </li>

    <li>
      <a href="/settings/profile" id="account_settings"
        class="tooltipped tooltipped-s"
        aria-label="Account settings ">
        <span class="octicon octicon-tools"></span>
      </a>
    </li>
    <li>
      <a class="tooltipped tooltipped-s" href="/logout" data-method="post" id="logout" aria-label="Sign out">
        <span class="octicon octicon-log-out"></span>
      </a>
    </li>

  </ul>

<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo-create"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


    <li class="section-title">
      <span title="TDB-UU/Prog2">This repository</span>
    </li>
      <li>
        <a href="/TDB-UU/Prog2/issues/new"><span class="octicon octicon-issue-opened"></span> New issue</a>
      </li>
</ul>

</div>


    
  </div>
</div>

      

        



      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="iEfhUKelZfnSN5RXUXakPO0fe4dTSQoqumyUiVQ8q2k=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="17975530" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/TDB-UU/Prog2/watchers">
        2
      </a>
      <span class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true">
        <span class="js-select-button">
          <span class="octicon octicon-eye-watch"></span>
          Watch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for conversations in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-watch"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
  

  <div class="js-toggler-container js-social-container starring-container ">
    <a href="/TDB-UU/Prog2/unstar"
      class="minibutton with-count js-toggler-target star-button starred"
      aria-label="Unstar this repository" title="Unstar TDB-UU/Prog2" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star-delete"></span><span class="text">Unstar</span>
    </a>

    <a href="/TDB-UU/Prog2/star"
      class="minibutton with-count js-toggler-target star-button unstarred"
      aria-label="Star this repository" title="Star TDB-UU/Prog2" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star"></span><span class="text">Star</span>
    </a>

      <a class="social-count js-social-count" href="/TDB-UU/Prog2/stargazers">
        0
      </a>
  </div>

  </li>


        <li>
          <a href="/TDB-UU/Prog2/fork" class="minibutton with-count js-toggler-target fork-button lighter tooltipped-n" title="Fork your own copy of TDB-UU/Prog2 to your account" aria-label="Fork your own copy of TDB-UU/Prog2 to your account" rel="nofollow" data-method="post">
            <span class="octicon octicon-git-branch-create"></span><span class="text">Fork</span>
          </a>
          <a href="/TDB-UU/Prog2/network" class="social-count">0</a>
        </li>


</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo"></span>
          <span class="author">
            <a href="/TDB-UU" class="url fn" itemprop="url" rel="author"><span itemprop="title">TDB-UU</span></a>
          </span>
          <span class="repohead-name-divider">/</span>
          <strong><a href="/TDB-UU/Prog2" class="js-current-repository js-repo-home-link">Prog2</a></strong>

          <span class="page-context-loader">
            <img alt="Octocat-spinner-32" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/TDB-UU/Prog2" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-gotokey="c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /TDB-UU/Prog2">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

        <li class="tooltipped tooltipped-w" aria-label="Issues">
          <a href="/TDB-UU/Prog2/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="i" data-selected-links="repo_issues /TDB-UU/Prog2/issues">
            <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>

      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/TDB-UU/Prog2/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="p" data-selected-links="repo_pulls /TDB-UU/Prog2/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/TDB-UU/Prog2/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_wiki /TDB-UU/Prog2/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/TDB-UU/Prog2/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /TDB-UU/Prog2/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/TDB-UU/Prog2/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /TDB-UU/Prog2/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/TDB-UU/Prog2/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /TDB-UU/Prog2/network">
          <span class="octicon octicon-git-branch"></span> <span class="full-word">Network</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/TDB-UU/Prog2.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/TDB-UU/Prog2.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone">
  <h3><strong>SSH</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="git@github.com:TDB-UU/Prog2.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="git@github.com:TDB-UU/Prog2.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/TDB-UU/Prog2" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/TDB-UU/Prog2" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <span class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <a href="https://help.github.com/articles/which-remote-url-should-i-use">
    <span class="octicon octicon-question"></span>
    </a>
  </span>
</p>



                <a href="/TDB-UU/Prog2/archive/master.zip"
                   class="minibutton sidebar-button"
                   aria-label="Download TDB-UU/Prog2 as a zip file"
                   title="Download TDB-UU/Prog2 as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:240ff3deb0d0d430f38ba7baed27c741 -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<a href="/TDB-UU/Prog2/find/master" data-pjax data-hotkey="t" class="js-show-file-finder" style="display:none">Show File Finder</a>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-remove-close js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/TDB-UU/Prog2/blob/master/ou2/RecursionTest.java"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/TDB-UU/Prog2" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">Prog2</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/TDB-UU/Prog2/tree/master/ou2" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">ou2</span></a></span><span class="separator"> / </span><strong class="final-path">RecursionTest.java</strong> <span aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="ou2/RecursionTest.java" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


  <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/TDB-UU/Prog2/contributors/master/ou2/RecursionTest.java">
    Fetching contributors…

    <div class="participation">
      <p class="loader-loading"><img alt="Octocat-spinner-32-eaf2f5" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32-EAF2F5.gif" width="16" /></p>
      <p class="loader-error">Cannot retrieve contributors at this time</p>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
        <span class="meta-divider"></span>
          <span>197 lines (164 sloc)</span>
          <span class="meta-divider"></span>
        <span>6.671 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
                <a class="minibutton tooltipped tooltipped-n js-update-url-with-hash"
                   aria-label="Clicking this button will automatically fork this project so you can edit the file"
                   href="/TDB-UU/Prog2/edit/master/ou2/RecursionTest.java"
                   data-method="post" rel="nofollow">Edit</a>
          <a href="/TDB-UU/Prog2/raw/master/ou2/RecursionTest.java" class="button minibutton " id="raw-url">Raw</a>
            <a href="/TDB-UU/Prog2/blame/master/ou2/RecursionTest.java" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/TDB-UU/Prog2/commits/master/ou2/RecursionTest.java" class="button minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->

            <a class="minibutton danger empty-icon tooltipped tooltipped-s"
               href="/TDB-UU/Prog2/delete/master/ou2/RecursionTest.java"
               aria-label="Fork this project and delete file"
               data-method="post" data-test-id="delete-blob-file" rel="nofollow">

          Delete
        </a>
      </div><!-- /.actions -->
    </div>
        <div class="blob-wrapper data type-java js-blob-data">
        <table class="file-code file-diff tab-size-8">
          <tr class="file-code-line">
            <td class="blob-line-nums">
              <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>

            </td>
            <td class="blob-line-code"><div class="code-body highlight"><pre><div class='line' id='LC1'><br/></div><div class='line' id='LC2'><span class="kn">import</span> <span class="nn">org.junit.*</span><span class="o">;</span></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">junit.framework.TestCase</span><span class="o">;</span></div><div class='line' id='LC4'><br/></div><div class='line' id='LC5'><span class="kn">import</span> <span class="nn">java.io.*</span><span class="o">;</span></div><div class='line' id='LC6'><br/></div><div class='line' id='LC7'><span class="cm">/**</span></div><div class='line' id='LC8'><span class="cm"> * Test class for assignment 2 in Computer programming II (1TD722):</span></div><div class='line' id='LC9'><span class="cm"> * Small exercises on recursion.</span></div><div class='line' id='LC10'><span class="cm"> *</span></div><div class='line' id='LC11'><span class="cm"> * @author Malin Kallen</span></div><div class='line' id='LC12'><span class="cm"> * @version 2</span></div><div class='line' id='LC13'><span class="cm"> */</span></div><div class='line' id='LC14'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">RecursionTest</span> <span class="kd">extends</span> <span class="n">TestCase</span> <span class="o">{</span></div><div class='line' id='LC15'>&nbsp;&nbsp;</div><div class='line' id='LC16'>&nbsp;&nbsp;<span class="c1">// Note: Exercise 10 and 12 must be checked man</span></div><div class='line' id='LC17'>&nbsp;&nbsp;</div><div class='line' id='LC18'>&nbsp;&nbsp;<span class="c1">/////////////////// Exercise 1 ///////////////////</span></div><div class='line' id='LC19'>&nbsp;&nbsp;<span class="nd">@Test</span></div><div class='line' id='LC20'>&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">testPower</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC21'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Exponent 0 --&gt; 1</span></div><div class='line' id='LC22'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">power</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span> <span class="mi">0</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC23'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">power</span><span class="o">(-</span><span class="mi">5</span><span class="o">,</span> <span class="mi">0</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC24'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC25'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Exponent 1 --&gt; base</span></div><div class='line' id='LC26'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">power</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span><span class="mi">1</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC27'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(-</span><span class="mi">5</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">power</span><span class="o">(-</span><span class="mi">5</span><span class="o">,</span><span class="mi">1</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC28'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC29'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Some larger exponents</span></div><div class='line' id='LC30'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">25</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">power</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span><span class="mi">2</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC31'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">25</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">power</span><span class="o">(-</span><span class="mi">5</span><span class="o">,</span><span class="mi">2</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC32'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(-</span><span class="mi">125</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">power</span><span class="o">(-</span><span class="mi">5</span><span class="o">,</span><span class="mi">3</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC33'>&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC34'>&nbsp;&nbsp;</div><div class='line' id='LC35'>&nbsp;&nbsp;<span class="c1">/////////////////// Exercise 2 ///////////////////</span></div><div class='line' id='LC36'>&nbsp;&nbsp;<span class="nd">@Test</span></div><div class='line' id='LC37'>&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">testMultiplicera</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC38'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Multiplication with 0 --&gt; 0</span></div><div class='line' id='LC39'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">multiply</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="mi">0</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC40'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">multiply</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span> <span class="mi">0</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC41'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC42'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Multiplication with 1 --&gt; same number</span></div><div class='line' id='LC43'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">multiply</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span> <span class="mi">1</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC44'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">multiply</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="mi">5</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC45'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC46'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Some higer numbers</span></div><div class='line' id='LC47'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">25</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">multiply</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span> <span class="mi">5</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC48'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">100</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">multiply</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span> <span class="mi">20</span><span class="o">),</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC49'>&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC50'>&nbsp;&nbsp;</div><div class='line' id='LC51'>&nbsp;&nbsp;<span class="c1">/////////////////// Exercise 4 ///////////////////</span></div><div class='line' id='LC52'>&nbsp;&nbsp;<span class="nd">@Test</span></div><div class='line' id='LC53'>&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">testHarmonic</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC54'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// harmonic(1) = 1</span></div><div class='line' id='LC55'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">harmonic</span><span class="o">(</span><span class="mi">1</span><span class="o">),</span> <span class="mf">0.000000001</span><span class="o">);</span></div><div class='line' id='LC56'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC57'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// harmonic(2) = 3/2</span></div><div class='line' id='LC58'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mf">1.5</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">harmonic</span><span class="o">(</span><span class="mi">2</span><span class="o">),</span> <span class="mf">0.000000001</span><span class="o">);</span></div><div class='line' id='LC59'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC60'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// harmonic(10) = 2.928968254...</span></div><div class='line' id='LC61'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mf">2.928968254</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">harmonic</span><span class="o">(</span><span class="mi">10</span><span class="o">),</span> <span class="mf">0.000000001</span><span class="o">);</span></div><div class='line' id='LC62'>&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC63'>&nbsp;&nbsp;</div><div class='line' id='LC64'>&nbsp;&nbsp;<span class="c1">/////////////////// Exercise 5 ///////////////////</span></div><div class='line' id='LC65'>&nbsp;&nbsp;<span class="nd">@Test</span></div><div class='line' id='LC66'>&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">testLargest</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC67'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Index 0 --&gt; First element</span></div><div class='line' id='LC68'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="o">[]</span> <span class="n">testArray</span> <span class="o">=</span> <span class="o">{</span><span class="mi">1</span><span class="o">};</span>    </div><div class='line' id='LC69'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">largest</span><span class="o">(</span><span class="n">testArray</span><span class="o">,</span> <span class="mi">0</span><span class="o">));</span>  </div><div class='line' id='LC70'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="o">[]</span> <span class="n">longerTestArray</span> <span class="o">=</span> <span class="o">{</span><span class="mi">5</span><span class="o">,</span> <span class="mi">7</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="mi">32</span><span class="o">,</span> <span class="mi">45</span><span class="o">};</span></div><div class='line' id='LC71'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">5</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">largest</span><span class="o">(</span><span class="n">longerTestArray</span><span class="o">,</span> <span class="mi">0</span><span class="o">));</span></div><div class='line' id='LC72'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC73'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Larger index --&gt; Largest element among elements 0,...,i</span></div><div class='line' id='LC74'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">7</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">largest</span><span class="o">(</span><span class="n">longerTestArray</span><span class="o">,</span> <span class="mi">1</span><span class="o">));</span></div><div class='line' id='LC75'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">7</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">largest</span><span class="o">(</span><span class="n">longerTestArray</span><span class="o">,</span> <span class="mi">2</span><span class="o">));</span></div><div class='line' id='LC76'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">32</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">largest</span><span class="o">(</span><span class="n">longerTestArray</span><span class="o">,</span> <span class="mi">3</span><span class="o">));</span></div><div class='line' id='LC77'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertEquals</span><span class="o">(</span><span class="mi">45</span><span class="o">,</span> <span class="n">Recursion</span><span class="o">.</span><span class="na">largest</span><span class="o">(</span><span class="n">longerTestArray</span><span class="o">,</span> <span class="mi">4</span><span class="o">));</span></div><div class='line' id='LC78'>&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC79'>&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC80'>&nbsp;&nbsp;<span class="c1">/////////////////// Exercise 9 ///////////////////</span></div><div class='line' id='LC81'>&nbsp;&nbsp;<span class="nd">@Test</span></div><div class='line' id='LC82'>&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">testHanoi</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC83'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// 1 disc</span></div><div class='line' id='LC84'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">expectedOutput</span> <span class="o">=</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">);</span></div><div class='line' id='LC85'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkHanoi</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">,</span> <span class="sc">&#39;C&#39;</span><span class="o">,</span> <span class="mi">1</span><span class="o">,</span> <span class="n">expectedOutput</span><span class="o">);</span></div><div class='line' id='LC86'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC87'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// 2 discs</span></div><div class='line' id='LC88'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">expectedOutput</span> <span class="o">=</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;C&#39;</span><span class="o">)</span></div><div class='line' id='LC89'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">)</span></div><div class='line' id='LC90'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;C&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">);</span></div><div class='line' id='LC91'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkHanoi</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">,</span> <span class="sc">&#39;C&#39;</span><span class="o">,</span> <span class="mi">2</span><span class="o">,</span> <span class="n">expectedOutput</span><span class="o">);</span></div><div class='line' id='LC92'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC93'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// 2 discs, other names</span></div><div class='line' id='LC94'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">expectedOutput</span> <span class="o">=</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;M&#39;</span><span class="o">,</span> <span class="sc">&#39;K&#39;</span><span class="o">)</span></div><div class='line' id='LC95'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;M&#39;</span><span class="o">,</span> <span class="sc">&#39;H&#39;</span><span class="o">)</span></div><div class='line' id='LC96'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;K&#39;</span><span class="o">,</span> <span class="sc">&#39;H&#39;</span><span class="o">);</span></div><div class='line' id='LC97'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkHanoi</span><span class="o">(</span><span class="sc">&#39;M&#39;</span><span class="o">,</span> <span class="sc">&#39;H&#39;</span><span class="o">,</span> <span class="sc">&#39;K&#39;</span><span class="o">,</span> <span class="mi">2</span><span class="o">,</span> <span class="n">expectedOutput</span><span class="o">);</span></div><div class='line' id='LC98'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC99'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// 4 discs</span></div><div class='line' id='LC100'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">expectedOutput</span> <span class="o">=</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;C&#39;</span><span class="o">)</span></div><div class='line' id='LC101'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">)</span></div><div class='line' id='LC102'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;C&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">)</span></div><div class='line' id='LC103'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;C&#39;</span><span class="o">)</span></div><div class='line' id='LC104'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;B&#39;</span><span class="o">,</span> <span class="sc">&#39;A&#39;</span><span class="o">)</span></div><div class='line' id='LC105'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;B&#39;</span><span class="o">,</span> <span class="sc">&#39;C&#39;</span><span class="o">)</span></div><div class='line' id='LC106'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;C&#39;</span><span class="o">)</span></div><div class='line' id='LC107'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">)</span></div><div class='line' id='LC108'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;C&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">)</span></div><div class='line' id='LC109'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;C&#39;</span><span class="o">,</span> <span class="sc">&#39;A&#39;</span><span class="o">)</span></div><div class='line' id='LC110'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;B&#39;</span><span class="o">,</span> <span class="sc">&#39;A&#39;</span><span class="o">)</span></div><div class='line' id='LC111'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;C&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">)</span></div><div class='line' id='LC112'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;C&#39;</span><span class="o">)</span></div><div class='line' id='LC113'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">)</span></div><div class='line' id='LC114'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">+</span> <span class="n">expectedHanoiRow</span><span class="o">(</span><span class="sc">&#39;C&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">);</span></div><div class='line' id='LC115'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkHanoi</span><span class="o">(</span><span class="sc">&#39;A&#39;</span><span class="o">,</span> <span class="sc">&#39;B&#39;</span><span class="o">,</span> <span class="sc">&#39;C&#39;</span><span class="o">,</span> <span class="mi">4</span><span class="o">,</span> <span class="n">expectedOutput</span><span class="o">);</span></div><div class='line' id='LC116'>&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC117'>&nbsp;&nbsp;</div><div class='line' id='LC118'>&nbsp;&nbsp;<span class="c1">/////////////////// Exercise 17 ///////////////////</span></div><div class='line' id='LC119'>&nbsp;&nbsp;<span class="nd">@Test</span></div><div class='line' id='LC120'>&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">testReverseNumbers</span><span class="o">()</span> <span class="kd">throws</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC121'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// One number -&gt; The number itself</span></div><div class='line' id='LC122'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkReverseNumbers</span><span class="o">(</span><span class="s">&quot;1&quot;</span><span class="o">,</span> <span class="s">&quot;\\s?1\\s\\s?&quot;</span><span class="o">);</span></div><div class='line' id='LC123'><br/></div><div class='line' id='LC124'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// One number &gt; 10 -&gt; Still the number itself</span></div><div class='line' id='LC125'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkReverseNumbers</span><span class="o">(</span><span class="s">&quot;254685&quot;</span><span class="o">,</span> <span class="s">&quot;\\s?254685\\s\\s?&quot;</span><span class="o">);</span></div><div class='line' id='LC126'><br/></div><div class='line' id='LC127'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Several numbers -&gt; The numbers in reverse order</span></div><div class='line' id='LC128'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkReverseNumbers</span><span class="o">(</span><span class="s">&quot;232\n56\n94\n85\n123654\n2\n5\n985&quot;</span><span class="o">,</span></div><div class='line' id='LC129'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;\\s?985\\s\\s?5\\s\\s?2\\s\\s?123654\\s\\s?85\\s\\s?94\\s\\s?56\\s\\s?232\\s\\s?&quot;</span><span class="o">);</span></div><div class='line' id='LC130'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC131'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Non-digit -&gt; Empty string (up to 2 whitespaces)</span></div><div class='line' id='LC132'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkReverseNumbers</span><span class="o">(</span><span class="s">&quot;apa&quot;</span><span class="o">,</span> <span class="s">&quot;\\s?\\s?&quot;</span><span class="o">);</span></div><div class='line' id='LC133'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC134'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Non digit between numbers -&gt; Numbers before non-digit token in revers order</span></div><div class='line' id='LC135'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkReverseNumbers</span><span class="o">(</span><span class="s">&quot;232 56 end 94 85 123654 2 5 985&quot;</span><span class="o">,</span></div><div class='line' id='LC136'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;\\s?56\\s\\s?232\\s\\s?&quot;</span><span class="o">);</span></div><div class='line' id='LC137'>&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC138'>&nbsp;&nbsp;</div><div class='line' id='LC139'>&nbsp;&nbsp;<span class="c1">/////////////////// Help methods ///////////////////</span></div><div class='line' id='LC140'>&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC141'><span class="cm">   * Verify that Recursion.hanoi writes a string matching the provided regular</span></div><div class='line' id='LC142'><span class="cm">   * expression to System.out when called with the provided arguments (from, to,</span></div><div class='line' id='LC143'><span class="cm">   * help, n).</span></div><div class='line' id='LC144'><span class="cm">   * </span></div><div class='line' id='LC145'><span class="cm">   * @param from First argument to hanoi</span></div><div class='line' id='LC146'><span class="cm">   * @param to Second argument to hanoi</span></div><div class='line' id='LC147'><span class="cm">   * @param help Third argument to hanoi</span></div><div class='line' id='LC148'><span class="cm">   * @param n Fourth argument to hanoi</span></div><div class='line' id='LC149'><span class="cm">   * @param expectedOutput Regular expression which the string written to System.out by hanoi should match</span></div><div class='line' id='LC150'><span class="cm">   */</span></div><div class='line' id='LC151'>&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">checkHanoi</span><span class="o">(</span><span class="kt">char</span> <span class="n">from</span><span class="o">,</span> <span class="kt">char</span> <span class="n">to</span><span class="o">,</span> <span class="kt">char</span> <span class="n">help</span><span class="o">,</span> <span class="kt">int</span> <span class="n">n</span><span class="o">,</span> <span class="n">String</span> <span class="n">expectedOutput</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC152'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">PrintStream</span> <span class="n">stdout</span> <span class="o">=</span> <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">;</span></div><div class='line' id='LC153'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC154'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ByteArrayOutputStream</span> <span class="n">output</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ByteArrayOutputStream</span><span class="o">();</span></div><div class='line' id='LC155'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">System</span><span class="o">.</span><span class="na">setOut</span><span class="o">(</span><span class="k">new</span> <span class="n">PrintStream</span><span class="o">(</span><span class="n">output</span><span class="o">));</span></div><div class='line' id='LC156'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Recursion</span><span class="o">.</span><span class="na">hanoi</span><span class="o">(</span><span class="n">from</span><span class="o">,</span> <span class="n">to</span><span class="o">,</span> <span class="n">help</span><span class="o">,</span> <span class="n">n</span><span class="o">);</span></div><div class='line' id='LC157'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertTrue</span><span class="o">(</span><span class="n">output</span><span class="o">.</span><span class="na">toString</span><span class="o">().</span><span class="na">matches</span><span class="o">(</span><span class="n">expectedOutput</span><span class="o">));</span></div><div class='line' id='LC158'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC159'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">System</span><span class="o">.</span><span class="na">setOut</span><span class="o">(</span><span class="n">stdout</span><span class="o">);</span></div><div class='line' id='LC160'>&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC161'>&nbsp;&nbsp;</div><div class='line' id='LC162'>&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC163'><span class="cm">   * Verify that a call to Recursion.reverseNumbers writes a string matching the</span></div><div class='line' id='LC164'><span class="cm">   * provided regular expression to System.out when the provided string is</span></div><div class='line' id='LC165'><span class="cm">   * written to System.in.</span></div><div class='line' id='LC166'><span class="cm">   * </span></div><div class='line' id='LC167'><span class="cm">   * @param input Test data which is written to System.in</span></div><div class='line' id='LC168'><span class="cm">   * @param expectedOutput Regular expression which the string written to System.out by reverseNumbers should match</span></div><div class='line' id='LC169'><span class="cm">   */</span></div><div class='line' id='LC170'>&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">checkReverseNumbers</span><span class="o">(</span><span class="n">String</span> <span class="n">input</span><span class="o">,</span> <span class="n">String</span> <span class="n">expectedOutput</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC171'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">PrintStream</span> <span class="n">stdout</span> <span class="o">=</span> <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">;</span></div><div class='line' id='LC172'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">InputStream</span> <span class="n">stdin</span> <span class="o">=</span> <span class="n">System</span><span class="o">.</span><span class="na">in</span><span class="o">;</span></div><div class='line' id='LC173'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC174'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">OutputStream</span> <span class="n">output</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ByteArrayOutputStream</span><span class="o">();</span></div><div class='line' id='LC175'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">System</span><span class="o">.</span><span class="na">setOut</span><span class="o">(</span><span class="k">new</span> <span class="n">PrintStream</span><span class="o">(</span><span class="n">output</span><span class="o">));</span></div><div class='line' id='LC176'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">System</span><span class="o">.</span><span class="na">setIn</span><span class="o">(</span><span class="k">new</span> <span class="n">ByteArrayInputStream</span><span class="o">(</span><span class="n">input</span><span class="o">.</span><span class="na">getBytes</span><span class="o">()));</span></div><div class='line' id='LC177'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Recursion</span><span class="o">.</span><span class="na">reverseNumbers</span><span class="o">();</span></div><div class='line' id='LC178'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">assertTrue</span><span class="o">(</span><span class="n">output</span><span class="o">.</span><span class="na">toString</span><span class="o">().</span><span class="na">matches</span><span class="o">(</span><span class="n">expectedOutput</span><span class="o">));</span></div><div class='line' id='LC179'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC180'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">System</span><span class="o">.</span><span class="na">setIn</span><span class="o">(</span><span class="n">stdin</span><span class="o">);</span></div><div class='line' id='LC181'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">System</span><span class="o">.</span><span class="na">setOut</span><span class="o">(</span><span class="n">stdout</span><span class="o">);</span></div><div class='line' id='LC182'>&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC183'>&nbsp;&nbsp;</div><div class='line' id='LC184'>&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC185'><span class="cm">   * Generate a regular expression which matches the string which can be expected</span></div><div class='line' id='LC186'><span class="cm">   * to be written by hanoi when a disc is moved from one rod to another.</span></div><div class='line' id='LC187'><span class="cm">   * </span></div><div class='line' id='LC188'><span class="cm">   * @param to Name of rod which the disc is moved from</span></div><div class='line' id='LC189'><span class="cm">   * @param from Name of rod which the disc is moved to</span></div><div class='line' id='LC190'><span class="cm">   * @return Regular expression which should match the string written by hanoi when a disc is moved from &quot;from&quot; to &quot;to&quot;</span></div><div class='line' id='LC191'><span class="cm">   */</span></div><div class='line' id='LC192'>&nbsp;&nbsp;<span class="kd">private</span> <span class="n">String</span> <span class="nf">expectedHanoiRow</span><span class="o">(</span><span class="kt">char</span> <span class="n">from</span><span class="o">,</span> <span class="kt">char</span> <span class="n">to</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC193'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="s">&quot;\\s*&quot;</span> <span class="o">+</span> <span class="n">from</span> <span class="o">+</span> <span class="s">&quot;\\s*-&gt;\\s*&quot;</span> <span class="o">+</span> <span class="n">to</span> <span class="o">+</span> <span class="s">&quot;\\s*\n&quot;</span><span class="o">;</span></div><div class='line' id='LC194'>&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC195'>&nbsp;&nbsp;</div><div class='line' id='LC196'><span class="o">}</span></div></pre></div></td>
          </tr>
        </table>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.09423s from github-fe125-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close js-ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

  </body>
</html>

